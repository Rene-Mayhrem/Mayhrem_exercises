import unittest

from main import Main

class Test(unittest.TestCase):
    
    def test_nb_year(self):
        main = Main()
        self.assertEqual(main.nb_year(1500, 5, 100, 5000))

if __name__ == 'main':
    unittest.main()


