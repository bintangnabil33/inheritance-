package Inheritance;

public class CD extends Product {
    String artist;
    int totalSong;
    String label;

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getTotalSong() {
        return this.totalSong;
    }

    public void setTotalSong(int totalSong) {
        this.totalSong = totalSong;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public CD(){
        
        number = 2;
        name="Perayaan Patah Hati";
        quantity=1;
        price=35000;
        artist="For Revenge";
        totalSong=8;
        label="Sony Music";
    }

    public CD(int number, String name, int quantity, double price, String artist, int totalSong, String label){
        super(number, name, quantity, price);
        this.totalSong = totalSong;
        this.artist = artist;
        this.label = label;

    }


    @Override
    public void print(){
        super.print();
        System.out.println("Name: "+name);
        System.out.println("Artist: "+artist);
        System.out.println("Songs: "+totalSong);
        System.out.println("Label"+label);
        System.out.println("Price: "+price);
        System.out.println("Quantity: "+quantity);
        System.out.println("Number: "+number);
    }
        
    

}
