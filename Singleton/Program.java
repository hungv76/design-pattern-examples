public class Program {
  public static void main(String arg[]) {
    PrinterSingleton printer = PrinterSingleton.getInstance();
    printer.addToPrintQueue("This is a singleton Printer");
    printer.addToPrintQueue("Do not attempt to print more than one thing at once");
    printer.addToPrintQueue("Patience is the key");
    printer.print();
    printer.print();
    printer.print();
    printer.print();
  }
}