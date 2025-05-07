import java.io.*; 
class Showfile {
    public static void main(String args[]) throws IOException {
        String source = "Hello World"; 
        byte buf[] = source.getBytes();  
        FileInputStream fin;  
        int i;

        try {
            FileOutputStream f1 = new FileOutputStream("file.txt");
            for (i = 0; i < buf.length; i++) {
                f1.write(buf[i]);
            }
            f1.close();  
        } catch (IOException e) {
            System.out.print("An I/O Error occurred");
            return;
        }
        try {
            fin = new FileInputStream(args[0]); 
        } catch (FileNotFoundException e) {
            System.out.print("File not found");
            return;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("Usage: showfile <file>");
            return;
        }
        do {
            i = fin.read();  
            if (i != -1) {
                System.out.print((char) i); 
            }
        } while (i != -1);
        fin.close(); 
    }
}

