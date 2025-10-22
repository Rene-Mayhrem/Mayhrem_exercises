# 
#? p0 represents the current population
#? percent represent how the population increases per year
#? aug represents people coming to the city
#? p represents the population equal or to surpass

#! Creating a variable for the needed years and we will be updating the value
#! Inside the loop the we perform the operation to increse the population 

class Main:
    @staticmethod
    def nb_year(p0, percent, aug, p):
        years = 0
        while (p0 < p):
            p0 += (p0 * (percent / 100)) + aug
            years += 1
        return years
    
if __name__ == 'main':
    main = Main()
    print(main.nb_year(1500, 5, 100, 5000))

main = Main()
print(main.nb_year(1500, 5, 100, 5000))