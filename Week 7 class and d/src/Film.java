public class Film {

        String title;
        int releaseYear;
        double duration;
        private int soldTickets;

        public Film(String title, double duration, int soldTickets) {
            this.title = " ";
            this.releaseYear = 0;
            this.duration = 0;
            this.soldTickets = 0;
        }

        public void sellTickets(int numTickets) {
            soldTickets += numTickets;
        }
        public int getSoldTickets() {
            return this.soldTickets;
        }


}
