public class Cidade {
    public static void main(String[] args) {
        String[] cidades;
        cidades = new String[]{"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asuncion", "Sao Paulo", "Lima", "Santiago", "Lisboa", "Tokio"};

        int[][] temperaturas = {
                {-2, 33},
                {-3, 32},
                {-8, 27},
                {4, 37},
                {6, 42},
                {5, 43},
                {0, 39},
                {-7, 26},
                {-1, 31},
                {-10, 35}
        };

        int min = temperaturas[0][0];
        int max = 0;

        String minCity = cidades[0];
        String maxCity = cidades[0];

        for (int line = 0; line < cidades.length; line++) {
            String city = cidades[line];

            for (int column = 0; column < 2; column++) {
                int temperature = temperaturas[line][column];

                if (temperature < min) {
                    min = temperature;
                    minCity = city;
                }

                if (max < temperature) {
                    max = temperature;
                    maxCity = city;
                }
            }
        }

        System.out.println(String.format("A temperatura mais baixa foi %s da cidade %s", min, minCity));
        System.out.println(String.format("A temperatura mais alta foi %s da cidade %s", max, maxCity));
    }
}