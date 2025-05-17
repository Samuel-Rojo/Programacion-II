import java.util.Arrays;
class GeneradorArrays {
        private String[] words;
        public GeneradorArrays(String[] words) {
            this.words = words;
            sortWords();
        }
        // Ordenar el arreglo alfabéticamente
        private void sortWords() {
            Arrays.sort(words);
        }

        // Buscar una palabra usando búsqueda binaria
        public int searchWord(String word) {
            return Arrays.binarySearch(words, word);
        }
        // Mostrar el arreglo ordenado
        public void displayWords() {
            System.out.println("Arreglo ordenado:");
            for (String word : words) {
                System.out.println("- " + word);
            }
        }
    }
