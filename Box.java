public class Box {
    int height;
    int width;
    int length;
    static  void Calculate_area(int height,int width,int length){

        System.out.println(height*width*length);
    }
    static void Calculate_area(int height,int width){

        System.out.println(height*width);
    }
    public void display(){
        System.out.println(height+" "+width+" "+length);

    }
    public static void main(String[] args){
        Box obj=new Box();
        obj.height=5;
        obj.width=3;
        obj.length=6;
        obj.display();
        Calculate_area(3,4,6);
        Calculate_area(3,4);


    }

}
