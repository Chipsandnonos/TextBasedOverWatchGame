public class Battle1
{
  public static void main(String args[])
  {
    new Battle1();
  }
  
  public Battle1 ()
  {
    int Phealth = 100;
    int BossH = 200;
    int SDamage = 20;
    int FDamage = 25;
    int PDamage = 25;
    while (Phealth >0 && BossH >0)
    {
      for (int i = 6; i>=0; i--)
      {
        if (BossH > 0 && Phealth > 0)
        {
          if (i > 0)
          {
            System.out.println("");
            System.out.println("It's your turn, you have " + i + " bullets.");
            char move = IBIO.inputChar("Your turn: Shoot(S) / Fan the hammer(H)/ Flashbang (F)/ Punch(P)/ Information (I)");
            int Phit = (int)(Math.random()*9 +1);
            if (move == 's'||move == 'S')
            {
              BossH = BossH - SDamage;
              System.out.println("Boss Health: " + BossH + ".");
              SDamage = 20;
              
            }
            else if (move == 'h' || move == 'H')
            {
              if ( Phit < 2)
              {
                System.out.println("You quickly shoot all of your bullets, AND THEY HIT! (You have no more bullets)");
                BossH = BossH - i*FDamage;
                System.out.println("Boss Health: " + BossH + ".");
                i = 1; //subject to break
                FDamage = 25;
              }
              else
              {
                System.out.println("You quickly shoot all of the bullest in your clip, too bad they all missed :( ");
                i = 1;
                System.out.println("Boss Health: " + BossH + ".");
                FDamage = 25;
              }
            }
            else if (move == 'f' || move == 'F')
            {
              if (i <=3)
              {
                System.out.println("IT HIT!, your next move will crit doing extra damage if it hits! ");
                FDamage = 35;
                SDamage = 50;
                PDamage = 75;
                System.out.println("Boss Health: " + BossH + ".");
              }
              else
              {
                System.out.println("You missed....");
                System.out.println("Boss Health: " + BossH + ".");
              }
              
            }
            else if (move == 'p' || move == 'P')
            {
              if (Phit <= 4)
              {
                i++;
                BossH = BossH - PDamage;
                System.out.println("You right hooked him right in the face!");
                System.out.println("Boss Health: " + BossH + ".");
                PDamage = 25;
              }
              else
              {
                i++;
                System.out.println("Looks like you swung and missed....");
                System.out.println("Boss Health: " + BossH + ".");
                PDamage = 25;
              }
              
            }
            else if (move == 'i' || move == 'I')
            {}
            else 
            { 
              System.out.println("That's not an option........");
              i++;
            }
            
            
          }
          else 
          {
            System.out.println("You ran out of bullets, you need to reload and waste your turn.");
            i = 7;
          }
          
        }
        else
        {i = - 1;}
      }
    }
    
    public int BossTurn(int Phealth)
    {
      int AttackkMove = (int)(Math.random()*7 + 1);
      int Pdamage;
      if (AttackMove == 1)
      {
        System.out.println("Enemy Turn: ");
        System.out.println("The enemy uses their sword to conjure several tornados!");
        Pdamage = DescPR(1);
        Phealth = PlayerGDmg(Phealth, Pdamage);
      }
      else if (AttackMove == 2)
      {
        System.out.println("Enemy Turn: ");
        System.out.println("The enemy dashes straight at you, sword drawn coming right at you!");
        Pdamage = DescPR(2);
        Phealth = PlayerGDmg(Phealth, Pdamage);
      }
      else if (AttackMove == 3)
      {
        System.out.println("Enemy Turn: ");
        System.out.println("The enemy draws his gun, and starts shooting at you!");
        Pdamage = DescPR(3);
        Phealth = PlayerGDmg(Phealth, Pdamage);
      }
      else 
      {
        System.out.println("Enemy Turn: ");
        System.out.println("The enemy summons a tornado and shoots into it, causing bullets to rain down!");
        Pdamage = DescPR(4);
        Phealth = PlayerGDmg(Phealth, Pdamage);
      }
      return Phealth;
    }
    public int PlayerGDmg(int Phealth, int Pdamage)
    {
      Phealth = Phealth - Pdamage;
      System.out.println("");
      System.out.println("You take " + Pdamage + " you know now have " + Phealth + ".");
      return Phealth;
    }
    public int DescPR(int Attacktype)
    {
      int damage;
      if (Attacktype == 1)
      {
        char choice = IBIO.inputChar(" What do you do? Roll/Dodge (R) / Hide (H ");
        if (choice == 'h'||choice == 'H')
        { 
          System.out.println("You decide to hide, the tornados can't destroy your cover and they disapate!");
          damage = 0;
        }
        else if (choice == 'r'||choice == 'R')
        { 
          System.out.println("You choose to roll, too bad you get caught up in the tailwind of the tornados...");
          damage = 10;         
        }
        else
        { 
          System.out.println("You confuse yourself and stand still and get hit...");
          damage = 10;
        }
      }
      else if (Attacktype == 2)
      {
        char choice = IBIO.inputChar(" What do you do? Roll/Dodge (R) / Hide (H ");
        if (choice == 'r'||choice == 'R')
        {
          System.out.println("You decide to roll, and the enemy runs into a wall!");
          damage = 0;
        }
        else if (choice == 'h'||choice == 'H')
        { 
          System.out.println("You choose to hide, too bad the enemy shattered your cover and hit you....");
          damage = 10;         
        }
        else
        { 
          System.out.println("You confuse yourself and stand still and get hit...");
          damage = 10;
        }
      }
      else if (Attacktype == 3)
      {
        char choice = IBIO.inputChar(" What do you do? Roll/Dodge (R) / Hide (H ");
        if (choice == 'r'||choice == 'R')
        { 
          System.out.println("You decide to roll, and dodge the enemy's bullets!");
          damage = 0;
        }
        else if (choice == 'h'||choice == 'H')
        { 
          System.out.println("You choose to hide, too bad the enemy's bullets penetrate your cover and you get hit...");
          damage = 10;         
        }
        else
        { 
          System.out.println("You confuse yourself and stand still and get hit...");
          damage = 10;
        }
      }
      else
      {
        char choice = IBIO.inputChar(" What do you do? Roll/Dodge (R) / Hide (H ");
        if (choice == 'h'||choice == 'H')
        { 
          System.out.println("You decide to hide, the bullets rain down but your cover save you!");
          damage = 0;
        }
        else if (choice == 'r'||choice == 'R')
        { 
          System.out.println("You choose to roll, too bad you get caught up in the bullet storm...");
          damage = 10;         
        }
        else
        { 
          System.out.println("You confuse yourself and stand still and get hit...");
          damage = 10;
        }
      }
      return damage;
    }
  }
}