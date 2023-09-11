alphabet = ['ABC','DEF','GHI','JKL','MNO','PQRS','TUV','WXYZ']
word = input()
answer = 0
for i in word:
    for index,val in enumerate(alphabet):
        if i in val:
            answer += index +3
            break;
print(answer)