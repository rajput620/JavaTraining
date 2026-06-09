using namespace std;
#include <iostream>

class node {
    public :
    int data;
    node *left,*right;
    node(int x) {
        data =x;
        //left=right=x;
    }
};

node *create() {
    node *root;
    int x;
    cout<<"\n Enter data:";
    cin>>x;
    if(x==-1)
    return NULL;
    root=new node(x);
    cout<<"\n Enter left child of "<<x;
    root->left = create();
    cout<<"\n Enter right child of "<<x;
    root->right = create();
    return root;
}

void preorder(node*root) {
    if(root!=nullptr) 
    {
        cout << root->data;
        preorder(root->left);
        preorder(root->right);
    }
}

int main() {
    node *root = create();
    preorder(root);
    return 0;
}
