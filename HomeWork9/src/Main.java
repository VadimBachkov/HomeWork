import java.io.*;

public class Main {
    public static void main(String[] args) {
        String directoryPath = "E:\\idea-workspace\\HomeWork\\HomeWork\\HomeWork9\\src\\Files";

        File directory = new File(directoryPath);
        File[] files = directory.listFiles();

        if(files != null){
            try{
                FileWriter writer = new FileWriter("result.txt", true);
                for (File file : files){
                    if (file.isFile()){
                        BufferedReader reader = new BufferedReader(new FileReader(file));
                        String line;

                        while ((line =  reader.readLine()) != null){
                            writer.write(line);
                        }
                        reader.close();
                    }
                }
                writer.close();
                System.out.println("Файл 'result.txt' успешно создан и заполнен содержимым файлов");
            }catch (IOException e){
                System.out.println("Ошибка при записи в файл 'resul.txt': " + e.getMessage());
            }
        }else {
            System.out.println("Указанный каталог не существует");
        }
    }
}

