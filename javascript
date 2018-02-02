<input id="amount" type="text" value="-123456"/>
<input type="button" onclick="FormatCurrency()" value="Format"/>
<div id="output"></div>
<div id="formatToDollar"></div>

<script>
function FormatCurrency ()
{
    var amount = parseFloat(document.getElementById('amount').value);
    
    document.getElementById('output').innerHTML =
        amount.toLocaleString('en-US', { style: 'currency', currency: 'USD' });
}
</script>
