class Application {

  String name;

  public Application(String name) {
    this.name = name;
  }

  public void run(String[] args) {
    System.out.println(this.name);

    for(int ii = 0; ii < args.length; ii++) {
      System.out.println(args[ii]);
    }
  }
}