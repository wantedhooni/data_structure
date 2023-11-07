package array;

public class chapter3_inits {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 1;
        String[] strings = new String[ARRAY_LENGTH]; // 참조 타입
        byte[] bytes = new byte[ARRAY_LENGTH];
        short[] shorts = new short[ARRAY_LENGTH];
        int[] ints = new int[ARRAY_LENGTH];
        float[] floats = new float[ARRAY_LENGTH];
        long[] longs = new long[ARRAY_LENGTH];
        double[] doubles = new double[ARRAY_LENGTH];
        boolean[] booleen = new boolean[ARRAY_LENGTH];

        System.out.println("참조 타입의 초기 값: " + strings[0]);
        System.out.println("byte 타입의 초기 값: " + bytes[0]);
        System.out.println("shorts 타입의 초기 값: " + shorts[0]);
        System.out.println("ints 타입의 초기 값: " + ints[0]);
        System.out.println("floats 타입의 초기 값: " + floats[0]);
        System.out.println("longs 타입의 초기 값: " + longs[0]);
        System.out.println("doubles 타입의 초기 값: " + doubles[0]);
        System.out.println("boolean 타입의 초기 값: " + booleen[0]);
    }
}
