from selenium import webdriver
import unittest

class example(unittest.TestCase):
  
    @classmethod
    def setUpClass(cls):

        cls.driver = webdriver.Chrome("C:\Program Files (x86)\chromedriver.exe")
        cls.driver.maximize_window()
        
    def test_login(self):
      
      self.driver.get("https://eu-uat2.weissr-cloud.com")
      
    @classmethod
    def tearDownClass(cls):

        cls.driver.quit()
        print("Test Completed")
        
if __name__ == '__main__':
  unittest.main()

