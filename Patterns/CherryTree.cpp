#include<bits/stdc++.h>
using namespace std;

#define ll long long
#define pb push_back
#define ff first
#define ss second
#define mp make_pair
 
 

int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
 
    
    int t;
    cin>>t;
    while(t--)
    {
        ll n;
        cin>>n;
        ll a[n];
        ll prev=0, ans=0;
        for(int i=0; i<n; i++)
        {
            cin>>a[i];
            ll prod = a[i] * prev;
            ans = (ans > prod) ? ans : prod;
            prev = a[i];
        }
        cout<<ans<<endl;
    }
    return 0;
}
