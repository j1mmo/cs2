    public static int factorial(int n)
    // Recursion solution
    {
        if (n == 0 || n == 1) return 1;
        else return n*factorial(n-1);
    }
    public static int factorial2(int n)
    // iteration solution
    {
        int factorial = 1;
        for(int i = 1; i <= n; i++){
            factorial *= i;
        }
        return factorial;
    }
