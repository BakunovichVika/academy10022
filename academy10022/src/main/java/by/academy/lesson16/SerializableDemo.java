package by.academy.lesson16;

import by.academy.lesson1.Cat;

import java.io.*;

public class SerializableDemo {
    public static void main(String[] args){

        Cat cat = new Cat(15, "Петька");

        try (BufferedOutputStream catSer = new BufferedOutputStream(new FileOutputStream("catSerializable.txt"));
            ObjectOutputStream oos = new ObjectOutputStream(catSer)) {
            oos.writeObject(cat);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        try (BufferedInputStream catDes = new BufferedInputStream(new FileInputStream("catSerializable.txt"));
             ObjectInputStream isu = new ObjectInputStream(catDes)){
            Cat cat1 = (Cat) isu.readObject();
            System.out.println(cat1);

        } catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}


//        } catch (IOException ex) {
//    System.out.println(ex.getMessage());
//            }
//
//        }
//    }
//}
