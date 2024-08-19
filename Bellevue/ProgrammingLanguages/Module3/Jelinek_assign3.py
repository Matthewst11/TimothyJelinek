# ###The following C function computes the power ab, where a is a floating-point number and b is a (non-negative) integer:
# double power (double a, int b) {
# int  i;
# double temp  =  1.0;
# for (i  =  1; i  <=  b;  i++)  temp *=  a;
# return temp;
# ### 
def power(a, b):
    temp = 1.0
    for i in range(1, b+1):
        temp *= a
    return temp

## Rewrote answer one using an accumulating parameter to make it tail-reclusive
def power_tail_recursive(a, b, temp=1.0):
    if b == 0:
        return temp
    else:
        return power_tail_recursive(a, b - 1, temp * a)