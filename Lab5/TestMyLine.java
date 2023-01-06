public class TestMyLine {
    public static void main(String args[]) {
        MyLine line = new MyLine(0,0,1,1);
        double len = line.getLength();
        int x1 = line.getBeginX();
        int y1 = line.getBeginY();
        int x2 = line.getEndX();
        int y2 = line.getEndY();
        System.out.println(x1);
        System.out.println(y1);
        System.out.println(x2);
        System.out.println(y2);
        line.setBeginX(1);
        line.setBeginY(1);
        line.setEndX(0);
        line.setEndY(0);
        int bg[] = new int[2];
        bg = line.getBeginXY();
        int ed[] = new int[2];
        ed = line.getEndXY();
        System.out.println(bg[0]);
        System.out.println(bg[1]);
        System.out.println(ed[0]);
        System.out.println(ed[1]);
        double gra = line.getGradient();
        System.out.println(len);
        System.out.println(gra);
        System.out.println(line);
    }
}
