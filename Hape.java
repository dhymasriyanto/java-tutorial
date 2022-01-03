import java.util.Scanner;

public class Hape{
public static void main (String [] args){

Scanner sc = new Scanner(System.in);

System.out.println("Selamat datang di Toko A");

int pilihan=0;
double harga=0;

double hargaSamsung = 3500000;
double hargaAsus = 3450000;
double hargaHuawei = 3850000;
double hargaXiaomi = 3900000;

boolean samsung = false;
boolean asus= false;
boolean huawei= false;
boolean xiaomi= false;

double diskonA = 0.03;
double diskonB = 0.035;

double totalHarga = 0;

while(pilihan !=9){

System.out.println("Pilih barang : ");
System.out.println("1. Samsung");
System.out.println("2. Asus");
System.out.println("3. Huawei");
System.out.println("4. Xiaomi");
System.out.println("9. Keluar");

System.out.print("Masukkan pilihan :");
pilihan = sc.nextInt();

switch(pilihan){
case 1:
totalHarga += hargaSamsung;
samsung = true;
break;
case 2:
totalHarga += hargaAsus;
asus =true;
break;
case 3:
totalHarga += hargaHuawei;
huawei = true;
break;
case 4:
totalHarga += hargaXiaomi;
xiaomi = true;
break;
case 9:
if(totalHarga != 0) System.out.print("Terima kasih, total belanja anda Rp. " + totalHarga);
else System.out.println("Terima kasih!!");
System.exit(0);
break;
default:
System.out.println("Pilihan tidak tersedia");
break;
}
harga+=totalHarga;
if(samsung && asus) harga= totalHarga - (totalHarga*diskonA);
if(huawei && xiaomi) harga= totalHarga - (totalHarga*diskonB);

System.out.println("Ingin beli lagi?");
System.out.println("1. Ya");
System.out.println("9. Tidak");

System.out.print("Masukkan pilihan :"); 	
pilihan = sc.nextInt();


System.out.print("Terima kasih, total belanja anda Rp. " + Math.round(harga));
}
}
}