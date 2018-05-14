public class Printer {
    private int toner;
    private int sheets;
    private int copies;


    public Printer(int toner, int sheets, int copies) {
        this.toner = toner;
        this.sheets = sheets;
        this.copies = copies;
    }

    public void getPrint() {
        if (sheets >= copies){
            sheets -= copies;
            toner -= copies;
        }
    }

    public int getSheets() {
        return sheets;
    }

    public int getCopies() {
        return copies;
    }

    public int getToner() {
        return toner;
    }

    public int getRefill() {
        return sheets = 100;
    }

}
