package humelo.prosody.statistic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import org.junit.jupiter.api.Test;

public class StatisticTableIndexTest {

    private static final String DB_URL = "jdbc:postgresql://localhost:5432/test";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "password";

    Random random = new Random();
    private static final LocalDateTime START_TIME = LocalDateTime.of(2023, 3, 1, 0, 0);
    private static final LocalDateTime END_TIME = LocalDateTime.of(2023, 6, 30, 23, 59);

    private static final List<String> USERNAME_LIST = List.of("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
                                                              "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z");

    @Test
    void indexing() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");

        Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
        String sql = "INSERT INTO generate_statistics (id, username, voice_name, plan_name, generate_type, characters_count, created_at, modified_at) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);

        long startEpoch = START_TIME.toEpochSecond(ZoneOffset.UTC);
        long endEpoch = END_TIME.toEpochSecond(ZoneOffset.UTC);

        final List<String> users = createUsers();
        final List<String> voices = createVoices();
        final List<String> plans = createPlans();
        for (int i = 1; i <= 10000000; i++) {
            pstmt.setLong(1, i);
            pstmt.setString(2, getRandomValue(users));
            pstmt.setString(3, getRandomValue(voices));
            pstmt.setString(4, getRandomValue(plans));
            pstmt.setString(5, "TTS");
            pstmt.setInt(6, random.nextInt(190) + 10);
            final Timestamp startTime = Timestamp.valueOf(getRandomDateTime(startEpoch, endEpoch));
            pstmt.setTimestamp(7, startTime);
            pstmt.setTimestamp(8, startTime);

            pstmt.executeUpdate();
        }

        pstmt.close();
        conn.close();

    }

    private String getRandomValue(List<String> list) {
        return list.get(random.nextInt(list.size()));
    }

    private List<String> createUsers() {
        List<String> userList = new ArrayList<>();
        for (int i = 1; i < 1000; i++) {
            userList.add("USER" + i);
        }

        return userList;
    }

    private List<String> createVoices() {
        List<String> voiceList = new ArrayList<>();
        for (int i = 1; i < 200; i++) {
            voiceList.add("VOICE" + i);
        }

        return voiceList;
    }

    private List<String> createPlans() {
        List<String> planList = new ArrayList<>();
        planList.add("PLAN A");
        planList.add("PLAN B");
        planList.add("PLAN C");
        planList.add("PLAN D");

        return planList;
    }

    private LocalDateTime getRandomDateTime(long startEpoch, long endEpoch) {
        long randomEpoch = ThreadLocalRandom.current().nextLong(startEpoch, endEpoch);
        return LocalDateTime.ofEpochSecond(randomEpoch, 0, ZoneOffset.UTC);
    }

}
