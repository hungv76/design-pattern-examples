import java.util.ArrayList;

public class PrinterSingleton {
  private static PrinterSingleton printerInstance = null;
  private static ArrayList<String> printQueue = new ArrayList();

  private PrinterSingleton() {

  }

  public static PrinterSingleton getInstance() {
    if (printerInstance == null) {
      printerInstance = new PrinterSingleton();
    }
    return printerInstance;
  }

  public void print(){
    if(!printQueue.isEmpty()) {
      System.out.println(printQueue.get(0));
      printQueue.remove(printQueue.get(0));
      return;
    }
    System.out.println("The Printer's Queue is empty");
  }
  public void addToPrintQueue(String printContent) {
    printQueue.add(printContent);
  }
}