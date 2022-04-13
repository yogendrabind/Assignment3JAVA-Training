public class IntegerSum13 {
    public static void main(String[] args) {
        Integer[] arr = {10, 20, 30, 40, 50};
        IntegerSum13  obj = new IntegerSum13 ();
        Integer sum = obj.sum(arr);
        Integer numberOfElements = arr.length;
        Double ave = obj.average(sum, numberOfElements);
        System.out.println("sum = " + sum);
        System.out.println("average = " + ave);


    }

    public Double average(Integer sum, Integer numberOfElements) {
        Double response = 0.0;
        response = (double) sum / numberOfElements;
        return response;
    }

    public Integer sum(Integer[] arr) {
        Integer response = 0;
        for (Integer integer : arr) {
            response += integer;
        }
        return response;
    }
}