package javaguru.Lesson6;

public class MultiplicationTableTest {
    public static void main(String[] args) {
        MultiplicationTableTest testRunner = new MultiplicationTableTest();
        testRunner.ShouldPrintMultiplicationTable() ;

    }

    private void ShouldPrintMultiplicationTable() {
        MultiplicationTable table = new MultiplicationTable();
        table.print(5);
    }
}
