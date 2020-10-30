/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi menampilkan target saldo tabungan
 */
package pboif2.pkg10119059.latihan20.targettabungan;

/**
 *
 * @author Corazon
 */
public class PBOIF210119059Latihan20TargetTabungan {

    public static void main(String[] args) {
       double bunga,total,totalBunga;
        int saldoTarget,i,saldoAwal;
        
        saldoAwal = 3500000;
        bunga = 0.08;
        saldoTarget = 6000000;
        i=1;
        
        do{
            totalBunga = saldoAwal * bunga;
            total = totalBunga + saldoAwal;
            System.out.printf("Saldo di bulan ke-"+i+" Rp. %,1.0f%n",+total);
            saldoAwal += totalBunga;
            i++ ;
        } while (total <= saldoTarget);
    
    }   
}
