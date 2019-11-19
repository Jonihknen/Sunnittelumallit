package tehtävä12;

import java.util.ArrayList;
import java.util.List;

class ProxyExample {
   /**
    * Test method
    */
   public static void main(final String[] arguments) {
        Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        Image image2 = new ProxyImage("HiRes_10MB_Photo2");
        Image image3 = new ProxyImage("jonin kuva");
        
//        image1.displayImage(); // loading necessary
//        image1.displayImage(); // loading unnecessary
//        image2.displayImage(); // loading necessary
//        image2.displayImage(); // loading unnecessary
//        image1.displayImage(); // loading unnecessary
        
        ArrayList<Image> kuvalista = new ArrayList<Image>();
        kuvalista.add(image1);
        kuvalista.add(image2);
        kuvalista.add(image3);
        
        for(Image i : kuvalista) {
        	i.showData();
        }
        kuvalista.get(0).displayImage();
        kuvalista.get(1).displayImage();
        kuvalista.get(2).displayImage();
    }
}