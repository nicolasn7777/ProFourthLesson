package decryptor;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {

        String path = "D:\\programs\\IDE\\projects IDE\\ProFourthLesson\\src\\decryptor\\Text.txt";

        String readableString = Files.readString(Paths.get(path));

        try (FileWriter textDecrypted = new FileWriter
                ("D:\\programs\\IDE\\projects IDE\\ProFourthLesson\\src\\decryptor\\TextDecrypted.txt")) {
            textDecrypted.write(decrypt(readableString));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String decrypt (String oldText){
        List<String> matches = new ArrayList<>();
        matches.add(" без ");
        matches.add(" в ");
        matches.add(" у ");
        matches.add(" від ");
        matches.add(" для ");
        matches.add(" по ");
        matches.add(" через ");
        matches.add(" при ");
        matches.add(" про ");
        matches.add(" над ");
        matches.add(" під ");
        matches.add(" до ");
        matches.add(" з ");
        matches.add(" ради ");
        matches.add(" задля ");
        matches.add(" з-під ");
        matches.add(" із-за ");
        matches.add(" поза ");
        matches.add(" щодо ");

        for (int i = 0; i < matches.size(); i++) {
            Pattern p = Pattern.compile(matches.get(i), Pattern.CASE_INSENSITIVE);
            Matcher m = p.matcher(oldText);
            oldText = m.replaceAll(" Java ");
        }
        return oldText;
    }

}
