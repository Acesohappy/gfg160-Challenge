class Solution:
    
    #Function to check if two strings are rotations of each other or not.
    def areRotations(self,s1,s2):
        if(len(s1)!=len(s2)):
            return False
        s3=s1+s1
        return s2 in s3
