/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Sara_Toepper_extra_credit.cpp : Defines the entry point for the console application.
//
//Sara Toepper extra credit Date 3-15-18

#include "stdafx.h"
#include <iostream>
#include <cmath>
using namespace std;

/*int reverse(int v, int lim)
{
		if (lim == 1)
			return v;
		else
			//return (((v % 10)*pow(10, lim - 1)) + reverse(v / 10, lim - 1));
}*/
void print_c(int digit, int l, int r )
{
	if (l != 2)
	{
		switch (digit)
		{
		case 1: cout << "One";
			break;
		case 2: cout << "Two";
			break;
		case 3: cout << "Three";
			break;
		case 4: cout << "Four";
			break;
		case 5: cout << "Five";
			break;
		case 6: cout << "Six";
			break;
		case 7: cout << "Seven";
			break;
		case 8: cout << "Eight";
			break;
		case 9: cout << "Nine";
			break;
		}
	}
	else if (l == 2 or l == 5 or l == 8)
	{
		switch (digit)
		{
		case 1: switch (r)
		{
		case 10: cout << "Ten";
			break;
		case 11: cout << "Eleven";
			break;
		case 12: cout << "Twelve";
			break;
		case 13: cout << "Thirteen";
			break;
		case 14: cout << "Forteen";
			break;
		case 15: cout << "Fifteen";
			break;
		case 16: cout << "Sixteen";
			break;
		case 17: cout << "Seventeen";
			break;
		case 18: cout << "Eighteen";
			break;
		case 19: cout << "Nineteen";
			break;
		}
		break;
		case 20: cout << "Twenty";
			break;
		case 30: cout << "Thirty";
			break;
		case 40: cout << "Forty";
			break;
		case 50: cout << "Fifty";
			break;
		case 60: cout << "Sixty";
			break;
		case 70: cout << "Seventy";
			break;
		case 80: cout << "Eighty";
			break;
		case 90: cout << "Ninty";
			break;
		case 0: cout << " ";
			break;
		}
	}
}

int main()
{
	int num, temp, length = 0, result, n;
	cout << " Enter the number" << endl;
	cin >> num;
	temp = num;
	while (num > 0 )
	{
		num = num / 10;
		length++;
	}
	cout << length << endl;

	result = reverse(temp, length);
	while (result)
	{
		n = result % 10;
	
		result /= 10;
		if (length == 1)
		{
			print_c(n, length, result);
		}
		else if (length == 2 or length == 5 or length == 8)
		{
			if (n == 1)
			{
				print_c(n, length, result);
				break;
			}
			else
			{
				print_c(n, length, result);
				length--;
			}
		}
		else if (length == 3 or length ==6 or length == 9)
		{
			print_c(n, length, result);
			length--;
			if (n != 0)
			{
				cout << "hundred";
			}
		}
		else if (length == 4)
		{
			print_c(n, length, result);
			length--;
			if (n != 0)
			{
				cout << "Thousand";
			}
			}
		else if (length == 7)
		{
			print_c(n, length, result);
			length--;
			if (n != 0)
			{
				cout << "Million";
			}
		}
		else if (length == 10)
		{
			print_c(n, length, result);
			length--;
			if (n != 0)
			{
				cout << "Billion";
			}
		}
	}
	system("pause");
    return 0;
}
