export function areAnagrams(str1: string, str2: string): boolean {

    if (str1.length !== str2.length) {
        return false;
    }

    const freq = new Map<string, number>();
    // const freq = new Map<string, number>();

    for(const ch of str1)
    {
        freq.set(ch, (freq.get(ch)|| 0) + 1);
    }
    // for (const ch of str1) {
    //     freq.set(ch, (freq.get(ch) || 0) + 1);
    // }

    for (const ch of str2) {
        if (!freq.has(ch)) {
            return false;
        }

        freq.set(ch, freq.get(ch)! - 1);

        if (freq.get(ch) === 0) {
            freq.delete(ch);
        }
    }

    return freq.size === 0;
}

