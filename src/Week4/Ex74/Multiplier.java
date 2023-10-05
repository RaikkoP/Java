package Week4.Ex74;

public class Multiplier {
        private int multiplier;

        public Multiplier(int multiplierAtStart) {
            this.multiplier = multiplierAtStart;
        }

        public int multiply(int number) {
            return number * this.multiplier;
        }
}
