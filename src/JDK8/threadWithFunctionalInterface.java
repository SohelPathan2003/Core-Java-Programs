package JDK8;

import java.util.*;

public class threadWithFunctionalInterface {
      public static void main(String args[]){
			
     new Thread(((Runnable)()->System.out.println("i am a run method "))).start();
}
}
