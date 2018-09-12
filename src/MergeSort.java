public class MergeSort {
    private int[] data;
    
// Konstruktor
    public MergeSort(int n) {
        this.data = new int[n];
    }
    
// Method Set Data
    public void SetData(int index, int value) {
        if (index >= 0 && index < this.data.length) {
            this.data[index] = value;
        }
    }
    
// Method Print Data
    public void PrintData() {
        String out = "Data=";
        for (int a = 0; a < this.data.length; a++) {
            out += this.data[a] + ",";
        }
        System.out.println(out);
    }
    
// Method Merge Sort
public void Sort() {
// Tentukan posisi awal dan akhir
        int i = 0;
        int j = this.data.length - 1;
// Urutkan
        MergeSort(i, j);
    }

    private void MergeSort(int start, int end) {
// Tentukan jumlah data
        int n = (end - start + 1);
        if (n > 1) {
// Hitung nilai tengah
            int mid = (start + end) / 2;
// Rekursif MergeSort
            MergeSort(start, mid);
            MergeSort(mid + 1, end);
// Merge
            int[] temp = new int[n];
            int x = start;
            int y = mid + 1;
            for (int a = 0; a < n; a++) {
                if (x <= mid && y <= end) {
                    if (this.data[x] < this.data[y]) {
                        temp[a] = this.data[x];
                        x++;
                    } else {
                        temp[a] = this.data[y];
                        y++;
                    }
                } else if (x <= mid) {
                    temp[a] = this.data[x];
                    x++;
                } else {
                    temp[a] = this.data[y];
                    y++;
                }
            }
// Salin hasil pengurutan
            for (int a = 0; a < n; a++) {
                this.data[start + a] = temp[a];
            }
        }
    }

public static void main(String[] args) {
// Buat objek
        MergeSort mergesort = new MergeSort(10);
// Input isi
        mergesort.SetData(0, 5);
        mergesort.SetData(1, 3);
        mergesort.SetData(2, 7);
        mergesort.SetData(3, 6);
        mergesort.SetData(4, 9);
        mergesort.SetData(5, 4);
// Print
        mergesort.PrintData();
// Sort
        mergesort.Sort();
// Print
        mergesort.PrintData();
    }
}
