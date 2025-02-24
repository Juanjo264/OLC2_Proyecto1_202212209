using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Diagnostics;
using System.Linq;
using System.Threading.Tasks;
using analyzer;
using Antlr4;
using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Extensions.Logging;

namespace api.Controllers
{
    [Route("[controller]")]
    public class Compile : Controller
    {
        private readonly ILogger<Compile> _logger;

        public Compile(ILogger<Compile> logger)
        {
            _logger = logger;
        }


        public class CompileRequest
        {
            [Required]
            public required string code { get; set; }
        }
        // POST: Compile/Compile
        [HttpPost]
        public IActionResult Post([FromBody] CompileRequest request)
        {
            if (!ModelState.IsValid)
            {
                return BadRequest(new { error = "Invalid input" });
            }
            var inputStream = new AntlrInputStream(request.code);
            var lexer = new LanguageLexer(inputStream);
            var tokenStream = new CommonTokenStream(lexer);
            var parser = new LanguageParser(tokenStream);
            var tree = parser.program();

            // var walker = new ParseTreeWalker();
            // var listener = new CompilerListener();
            // walker.Walk(listener, tree);
            
            var Visitor = new CompilerVisitor();
            Visitor.Visit(tree);
            return Ok(new { result = Visitor.output });
            
            // return Ok(new { result = listener.GetResult() }); 
        }
    }
}