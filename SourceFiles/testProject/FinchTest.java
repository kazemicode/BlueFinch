package testProject;

 
// Needs a package declaration to move to another folder

import edu.cmu.ri.createlab.terk.robot.finch.Finch;

/**
 * Created by:
 * Date:
 * A starter file to use the Finch
 */

public class FinchTest
   {
   public static void main(final String[] args)
      {
      // Instantiating the Finch object
      Finch myFinch = new Finch();
     System.out.println("Going!");
     while(!(myFinch.isBeakUp())){
      if(myFinch.isObstacle() == false)
          {
              
              myFinch.setWheelVelocities(255, 255);
              
           }
           
      
       else if(myFinch.isObstacleLeftSide() || myFinch.isObstacleRightSide())
       {
           System.out.println("Backing up!");
           myFinch.setWheelVelocities(-255, -255);
           int random = (int) (Math.random() * 2);
       System.out.println(random);
       
       if(random == 1)
       {
           System.out.println("Turning Left!");
           myFinch.setWheelVelocities(-255, 255, 1000);
           
        }
       else
       {
           if(random == 1);
       {
           System.out.println("Turning right!");
           myFinch.setWheelVelocities(255, -255, 1000);
           
        }
           
       }
       
       
        }
    }

      // Always end your program with finch.quit()
      myFinch.quit();
      System.exit(0);
      }
      
    
   }

