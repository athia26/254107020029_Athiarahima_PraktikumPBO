package jobsheet1;

public class RoadBike extends Bike {
    private int tireWidth; 

    public void setTireWidth(int width){
        tireWidth = width;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Tire Width: "+tireWidth + "mm");
        System.out.println("Bike type: Road Bike");
    }
}

// i.	isbn: String
// ii.	judul: String 
// iii.	penulis: String
// iv.	penerbit: String
// v.	tahunTerbit: int
// vi.	jmlEksemplar: int
// vii.	jmlDipinjam: int
