import java.io.*;

public class Cyrcle {
    private Points centre;
    private float radius;
    private File file1;

    public Cyrcle(File file1) {
        this.file1 = file1;
        try {readfromfile();} catch (IOException e) {e.printStackTrace();}
    }

    public void readfromfile() throws IOException {
        InputStream is = new FileInputStream(file1);
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line = br.readLine();
        int sep = line.indexOf(32);
        Float x = Float.parseFloat(line.substring(0, sep));
        Float y = Float.parseFloat(line.substring(sep+1));
        centre = new Points(x, y);
        line = br.readLine();
        radius = Float.parseFloat(line);
        br.close();
    }

    public Points getCentre() {
        return this.centre;
    }
    public float getRadius() {
        return this.radius;
    }
}
