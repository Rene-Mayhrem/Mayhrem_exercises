class Solution:

    def mergeAlternately(self, word1: str, word2: str) -> str:
        i = 0
        result = ""
        while i < len(word1) or i < len(word2):
            if i < len(word1):
                result += word1[i]
            if i < len(word2):
                result += word2[i]
            i += 1
        return result
    

    def mergeAlternatelyAI(self, word1: str, word2: str) -> str:
        i = 0
        result = []
        while i < len(word1) or i < len(word2):
            if i < len(word1):
                result.append(word1[i])
            if i < len(word2):
                result.append(word2[i])
            i += 1
        return "".join(result)

    def mergeAlternatelyLeetcode (self, word1: str, word2: str) -> str:
        result = []
        for i in range(max(len(word1), len(word2))):
            if i >= len(word1):
                result.append(word2[i:])
                break
            elif i > len(word2):
                result.append(word1[i:])
                break
            result.append(word1[i])
            result.append(word2[i])
        return "".join(result)