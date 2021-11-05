package Stepic;
//3.3 the task is to make the robot move to the desired coordinate

 class RobotDemo {
     public static void main(String[] args) {
         Robot robot = new Robot(50,-30, Direction.DOWN);
         moveRobot(robot, -10, 20);
     }

     public enum Direction {
         UP,
         DOWN,
         LEFT,
         RIGHT
     }

     public static class Robot {
             int x;
             int y;
             Direction dir;

         public Robot (int x, int y, Direction dir) {
              this.x = x;
              this.y = y;
              this.dir = dir;
         }

         public Direction getDirection()
             {return dir;}

         public int getX() {return x;}

         public int getY() {return y;}

         public void turnLeft() {
             if      (dir == Direction.UP)    {dir = Direction.LEFT;}
             else if (dir == Direction.DOWN)  {dir = Direction.RIGHT;}
             else if (dir == Direction.LEFT)  {dir = Direction.DOWN;}
             else if (dir == Direction.RIGHT) {dir = Direction.UP;}
         }

         public void turnRight() {
             if      (dir == Direction.UP)    {dir = Direction.RIGHT;}
             else if (dir == Direction.DOWN)  {dir = Direction.LEFT;}
             else if (dir == Direction.LEFT)  {dir = Direction.UP;}
             else if (dir == Direction.RIGHT) {dir = Direction.DOWN;}
         }

         public void stepForward() {
             if (dir == Direction.UP)    {y++;}
             if (dir == Direction.DOWN)  {y--;}
             if (dir == Direction.LEFT)  {x--;}
             if (dir == Direction.RIGHT) {x++;}
         }
     }
//next comes mycode
     public static void moveRobot(Robot robot, int toX, int toY) {
         System.out.println(robot.getDirection() + ", " + robot.getY() + ", " + robot.getX());
         if(toY> robot.getY()){
             while(robot.dir!=Direction.UP) {
                 robot.turnRight();
             }
             while(toY!= robot.getY()){
                 robot.stepForward();
             }
             System.out.println(robot.getX() + ", " + robot.getY());
         }
         if(toX> robot.getX()){
             while(robot.dir!=Direction.RIGHT) {
                 robot.turnRight();
             }
             while(toX!= robot.getX()){
                 robot.stepForward();
             }
             System.out.println(robot.getX() + ", " + robot.getY());
         }
         if(toX< robot.getX()){
             while(robot.dir!=Direction.LEFT) {
                 robot.turnLeft();
             }
             while(toX!= robot.getX()){
                 robot.stepForward();
             }
             System.out.println(robot.getX() + ", " + robot.getY());
         }
         if(toY< robot.getY()){
             while(robot.dir!=Direction.DOWN) {
                 robot.turnRight();
             }
             while(toY!= robot.getY()){
                 robot.stepForward();
             }
             System.out.println(robot.getX() + ", " + robot.getY());
         }
     }
}


