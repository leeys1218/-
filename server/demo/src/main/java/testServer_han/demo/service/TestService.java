package testServer_han.demo.service;

import testServer_han.demo.model.*;
import java.util.HashMap;
import java.util.List;

public interface TestService {
    Diary getDiary(String user_id, int date);
    List<HashMap<String, String>> getCalender(String user_id);
    String predictEmo(String user_id, String title, String content, int date, int emotionIdx);
    HashMap<String, String> getRecomData(String user_id, int date);
    String getWord(String user_id, int date);
}
