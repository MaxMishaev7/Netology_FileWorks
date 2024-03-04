//import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String rootPath = "C://Game/";
        String partOfPath = "";
        String fileName = "";
        String[][] dirArr = {
                {"src", "src/main", "src/test"}, //"src/main/Main.java"
                {"res", "res/drawables", "res/vectors", "res/icons"},
                {"savegames"},
                {"temp"}
        };
        String[][] fileArr = {
                {"src/main", "Main.java", "Utils.java"},
                {"temp", "temp.txt"}
        };

        for(String[] paths : dirArr){
            for(String path : paths){
                partOfPath = path;
                java.io.File dir = new java.io.File(rootPath + partOfPath);
                if(dir.mkdir()){
                    System.out.println("The Folder was created");
                } else {
                    System.out.println("The Folder already exists");
                }
            }
        }
        String filePath = "";
        for(String[] paths : fileArr){
            for(int i = 0; i < paths.length; i++){
                if(i == 0){
                    filePath = paths[i];
                    System.out.println(filePath);
                } else {
                    fileName = paths[i];
                }
                java.io.File file = new java.io.File(rootPath + filePath, fileName);
                try{
                    if(file.createNewFile()){
                        System.out.println("File was created");
                    }else{
                        System.out.println("Perhaps file already exists");
                    }
                    fileName = "";
                }catch(java.io.IOException ex){
                    ex.getMessage();
                }
            }
        }

//        for (String[] paths : pathArr) {
//            if (paths.length > 1) {
//                for (String path : paths) {
//                    if (path.indexOf('.') != -1) {
//                        int slashIndex = path.lastIndexOf("/");
//                        fileName = path.substring(slashIndex + 1);
//                        System.out.println(fileName);
//                        fullPath = path.substring(0, slashIndex + 1);
//                        System.out.println(fullPath);
//                        //java.io.File dir = new java.io.File(rootPath + fullPath, fileName);
//                        fullPath = rootPath + fullPath + "/" + fileName;
//                    } else {
//                        fullPath = path;
//                        System.out.println(fullPath);
//                        //java.io.File dir = new java.io.File(rootPath + fullPath);
//                        fullPath = rootPath + path;
//                    }
//                    java.io.File dir = new java.io.File(fullPath);
//                    Main.createFoldersAndFiles(dir);
//                }
//            } else {
//                for (String path : paths) {
//                    fullPath = path;
//                    System.out.println(fullPath);
//                    java.io.File dir = new java.io.File(rootPath + fullPath);
//                }
//            }
            //System.out.println();


    }

//    public static void createFoldersAndFiles(java.io.File fileOrFolder) {
//        if (fileOrFolder.isDirectory()) {
//            if (fileOrFolder.mkdir()) {
//                System.out.println("Папка " + fileOrFolder.getPath() + "создана");
//            }
//        } else if (fileOrFolder.isFile()) {
//            try {
//                if (fileOrFolder.createNewFile()) {
//                    System.out.println("Файл" + fileOrFolder.getPath() + fileOrFolder.getName() + "cоздан");
//                }
//            } catch (java.io.IOException ex) {
//                System.out.println(ex.getMessage());
//            }
//        }
//    }
}