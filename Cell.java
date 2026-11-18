public class Cell<T> {
    private T data;

    public void setValue(T data) {
        this.data = data;
    }

    public T getValue() {
        return data;
    }

    // Method untuk menampilkan tipe data
    public void displayType() {
        if (data != null) {
            System.out.println("Nilai: " + data + " | Tipe Data: " + data.getClass().getName());
        } else {
            System.out.println("Nilai: null | Tipe Data: Tidak diketahui");
        }
    }

    public static void main(String[] args) {
        // Keuntungan Generic: Type Safety (tidak perlu casting manual dan aman dari ClassCastException)
        Cell<Integer> intCell = new Cell<>();
        intCell.setValue(100);
        intCell.displayType();

        Cell<String> strCell = new Cell<>();
        strCell.setValue("Belajar Generic Java");
        strCell.displayType();
    }
}