def smash(words):
    phrase = '' #? string where all the elements are gonna be concatenated
    for word in words:
        phrase += word+" " #? Adding elements to the empty string
    return phrase.strip() #? strip function eliminates 
