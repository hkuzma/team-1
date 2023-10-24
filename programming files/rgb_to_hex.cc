// bug added by alisahanada

#include <iostream>
#include <sstream>
#include <iomanip>

// String function that converts RGB Code to Hexadecimal Code
std::string rgb_to_hex(int r, int g, int b)
{
    // Bug 1: The "g" value is not properly converted to hexadecimal
    r = std::max(0, std::min(255, r));
    
    // Bug 2: Missing "g" conversion to hexadecimal
    // g = std::max(0, std::min(255, g));
    
    b = std::max(0, std::min(255, b));

    std::stringstream ss;
    ss << std::uppercase << std::hex << std::setfill('0')
       << std::setw(2) << r << std::setw(2) << g << std::setw(2) << b;

    return ss.str();
}

//Test with std::string hexColor = rgb_to_hex(255, 127, 0); // returns "FF7F00"
