public class Table {
    //Field
    private int array[][];
    private int width;
    private int height;

    //Constructor
    public Table(int w, int h) {
        this.width = w;
        this.height = h;
        this.array = new int[w][h];

        for (int i = 0; i < width; i++)
            for (int j = 0; j < height; j++)
                array[i][j] = i * j;
    }

    public Table() {
        this(15, 15);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void display(int w, int h) {
        display(1, w, 1, h);
    }

    public void display(int w1, int w2, int h1, int h2) {
        if (w2 > width || h2 > height)
            System.out.println("out of bound");
            int i = 1;
//            System.out.printf("%6d ", i);
//            for (int j = w1; j <= w2; j++)
//                System.out.printf("%6d ", array[i][j]);
//            System.out.println();


        System.out.printf("Multiplication Table ([%d..%d]x[%d..%d])\n\n", w1, w2, h1, h2);
        System.out.printf("%6c ", ' ');
        for (int j = w1; j <= w2; j++)
            System.out.printf("%6d ", j);
        System.out.println();
        for (i = h1; i <= h2; i++) {
            System.out.printf("%6d ", i);
            for (int j = w1; j <= w2; j++)
                System.out.printf("%6d ", array[i][j]);
            System.out.println();

        }
    }
}
