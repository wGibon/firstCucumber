# ceci est un commentaire

 Feature: super smoothie loyalty cards
   Description du scenario (non alanylsé par le compilateur
   More smoothie = more loyalty point

   Background:
     Given the following categorie
       | Drink  | Category            | Points |
       | banana | smoothie            | 10     |
       | orange | smoothieOriginal    | 12     |
       | tea    | tea                 | 10     |

   Scenario Outline: : gain loyalty point with buying smoothie
     Given Michael is a member
     When  Michael purchase <Qtity> <Drink> Drinks
     Then  he should gain <points> points
     Examples:
      | Drink  | Qtity | points |
      | banana | 1     | 10     |
      | orange | 2     | 24     |
      | tea    | 3     | 30     |

