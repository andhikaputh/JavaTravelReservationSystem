package com.lgcns.mission.travel.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.lgcns.mission.travel.IndividualTravel;
import com.lgcns.mission.travel.MissionUtil;
import com.lgcns.mission.travel.PackageTravel;
import com.lgcns.mission.travel.Travel;

public class TravelTest {
	private static ArrayList<Travel> travels = new ArrayList<>();

	public static void main(String[] args) {
//		
//		travels.add(new IndividualTravel("TRV001", "Munich", "German Airlines", 10));
//        travels.add(new IndividualTravel("TRV002", "Praha", "AirFrance", 20));
//        travels.add(new PackageTravel("TRV003", "LA", "Delta Airlines", 8));
//        travels.add(new IndividualTravel("TRV004", "Osaka", "Korean Air", 15));
//        travels.add(new PackageTravel("TRV005", "Shanghai", "Southern Airlines", 12));
//	int menu = -1;
//	while(menu !=9) {
//		printMenu();
//		menu = MissionUtil.getUserIntegerInput();
//		if(menu == 1 ) {
//			printHeader();
//			for(Travel travel : travels) {
//				System.out.println(travel);
//			}
//		}
//		else if(menu == 2) {
//			printHeader();
//			for (Travel travel : travels) {
//				if(travel instanceof IndividualTravel) {
//					System.out.println(travel);
//				}
//			}
//		}
//		else if ( menu == 3 ) {
//			printHeader();
//			for (Travel travel : travels) {
//				if(travel instanceof PackageTravel) {
//					System.out.println(travel);
//				}
//			}
//		}
//		else if (menu==4) {
//			
//			System.out.println("Input kode travel yang akan dipesan :");
//			String code = MissionUtil.getCodeInput();
//
//			boolean found = false;
//		for (Travel travel : travels) {
//			if(travel.getTravelCode().equals(code)) {
//				System.out.println("Input jumlah orang yang akan dipesan : ");
//				int numpeople = MissionUtil.getUserIntegerInput();
//				travel.setReserved(numpeople);
//				System.out.println("Pesanan untuk " + numpeople + " orang berhasil dibuat");
//				found = true;
//				break;
//			} 
//		}
//		if(!found) {
//			System.out.println("[Error] kode yang diinput salah");
//		}
//		
//		}
//		else if (menu==9) {
//			System.out.println(">>Keluar");
//		}
//		else {
//			System.out.println("Silahkan masukkan ulang");
//		}
//	}
//		
//	}
//	
//	public static void printMenu() {
//		System.out.println("========<Menu>========");
//		System.out.println("1. Periksa semua produk travel");
//		System.out.println("2. Periksa semua Individual");
//		System.out.println("3. Permintaan produk paket travel");
//		System.out.println("4. Reservasi produk travel");
//		System.out.println("9. End");
//		System.out.println( "==============================" );
//        System.out.print( "Pilih Menu : " );
//		
//	}
//	
//    public static void printHeader() {
//        printSeperator();
//        System.out.printf("%-12s %-15s %-20s %-20s %-30s %-30s %-25s\n",
//                "Kode Travel", "Nama Kota", "Penerbangan", "Jenis Travel",
//                "Jumlah minimum orang yang boleh berangkat", "Maksimal orang yang bisa reservasi", "Jumlah reservasi orang");
//        printSeperator();
//    }
//    public static void printSeperator() {
//        System.out.println( "------------------------------------------------" );
		
		// Kunci Jawaban 

        Travel[] travels = {
                new IndividualTravel( "TRV001", "Munich", "German Airlines", 10 ),
                new IndividualTravel( "TRV002", "Praha", "AirFrance", 20 ),
                new PackageTravel( "TRV003", "LA", "Delta Airlines", 8 ),
                new IndividualTravel( "TRV004", "Osaka", "Korean Air", 15 ),
                new PackageTravel( "TRV005", "Shanghai", "Shouthern Airlines", 12 )
        };
        
        int menu = -1;
        
        while ( menu != 9 ) {
            
            printMenu();
            menu = MissionUtil.getUserIntegerInput();
            
            if ( menu == 1 ) {
                printHeader();
                for ( int inx = 0 ; inx < travels.length ; inx++ ) {
                    System.out.println( travels[inx] );
                }
                printSeperator();
            } else if ( menu == 2 ) {
                printHeader();
                for ( int inx = 0 ; inx < travels.length ; inx++ ) {
//                	if (travels[inx] instanceof IndividualTravel) {
                    if ( "Individual Travel".equals( travels[inx].getTravelType() ) ) {
                        System.out.println( travels[inx] );
                    }
                }
                printSeperator();
            } else if ( menu == 3 ) {
                printHeader();
                for ( int inx = 0 ; inx < travels.length ; inx++ ) {
                	if (travels[inx] instanceof PackageTravel) {
//                    if ( "Paket Travel".equals( travels[inx].getTravelType() ) ) {
                        System.out.println( travels[inx] );
                    }
                }
                printSeperator();
            } else if ( menu == 4 ) {
                
                System.out.print( ">> Input kode travel yang akan dipesan : " );
                String travelCode = MissionUtil.getCodeInput();
                
                boolean isRightInput = false;
                
                for ( int inx = 0 ; inx < travels.length ; inx++ ) {
                    if ( travelCode.equals( travels[inx].getTravelCode() ) ) {
                        isRightInput = true;
                        break;
                    }
                }
                
                if ( isRightInput ) {
                    
                    System.out.print( ">> Input jumlah orang yang akan dipesan : " );
                    int reserved = MissionUtil.getUserIntegerInput();
                    if(reserved < 1){
                    	System.out.println("[Error] Harap pesan setidaknya 1 orang.");
                    	continue;
                    }
                    for ( int inx = 0 ; inx < travels.length ; inx++ ) {
                        if ( travelCode.equals( travels[inx].getTravelCode() ) ) {
                            travels[inx].setReserved( reserved );
                        }
                    }
                } else {
                    System.out.println( "[Error] Kode yang diinput salah." );
                }
            } else if ( menu == 9 ) {
                System.out.println( ">> Selesai!!" );
            } else {
                System.out.println( ">> silahkan input kembali!!" );
            }
        }
    }
    
    public static void printMenu() {
        System.out.println( "========== < Menu > ==========" );
        System.out.println( " 1. Periksa semua produk travel" );
        System.out.println( " 2. Periksa produk individual" );
        System.out.println( " 3. Permintaan produk paket travel" );
        System.out.println( " 4. Reservasi produk travel" );
        System.out.println( " 9. End" );
        System.out.println( "==============================" );
        System.out.print( "## Menu : " );
    }
    
    public static void printHeader() {
        printSeperator();
        System.out.println( "Kode Travel\tNama Kota\tPenerbangan\tJenis Travel\t\tJumlah minimum orang yang boleh berangkat\tMaksimal orang yang bisa reservasi\tJumlah reservasi orang" );
        printSeperator();
    }
    
    public static void printSeperator() {
        System.out.println( "------------------------------------------------------------------------------------------------" );
    }

}
