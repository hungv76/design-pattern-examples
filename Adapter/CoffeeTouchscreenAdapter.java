public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {
  private OldCoffceMachine oldVendingMachine;

  public chooseFirstSelection() {
    oldVendingMachine.selectA();
  }

  public chooseSecondSelection() {
    oldVendingMachine.selectB();
  }
}
