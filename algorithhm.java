    public String getRockPaperScissors(String pair) {
        if (this.isCalled == 0) {
          String[] choices = {"rock", "paper", "scissors"};
          this.isCalled++;
          return choices[new Random().nextInt(choices.length)];
        }
