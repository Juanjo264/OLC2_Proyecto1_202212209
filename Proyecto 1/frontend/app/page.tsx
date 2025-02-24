'use client';
import Editor from '@monaco-editor/react';
import { useState } from 'react';

const API_URL = 'http://localhost:5142';

export default function Home() {
  const [code, setCode] = useState<string>('');
  const [output, setOutput] = useState<string>('');
  const [isMenuOpen, setIsMenuOpen] = useState<boolean>(false);

  const handleExecute = () => {
    fetch(`${API_URL}/compile`, {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify({ code }),
    })
      .then(async (response) => {
        const data = await response.json();
        setOutput(data.result); 
      })
      .catch((error) => {
        console.error('Error:', error);
      });
  };

  const handleCreateFile = () => {
    setCode('');
  };

  const handleOpenFile = (event: React.ChangeEvent<HTMLInputElement>) => {
    const file = event.target.files?.[0];
    if (file) {
      const reader = new FileReader();
      reader.onload = (e) => {
        setCode(e.target?.result as string);
      };
      reader.readAsText(file);
    }
  };

  const handleSaveFile = () => {
    const blob = new Blob([code], { type: 'text/plain' });
    const a = document.createElement('a');
    a.href = URL.createObjectURL(blob);
    a.download = 'archivo.glt';
    a.click();
  };

  return (
    <div className='flex flex-col items-center justify-center min-h-screen py-2 bg-gray-900 text-white'>
      <div className='flex gap-4 mb-4'>
        <div className='relative'>
          <button
            className='bg-gray-700 hover:bg-gray-600 text-white font-bold py-2 px-4 rounded'
            onClick={() => setIsMenuOpen(!isMenuOpen)}
          >
            Archivo
          </button>
          {isMenuOpen && (
            <div className='absolute top-full left-0 mt-2 bg-gray-800 border border-gray-700 rounded shadow-lg w-48 z-10'>
              <button className='block px-4 py-2 text-white hover:bg-gray-700 w-full text-left' onClick={handleCreateFile}>Crear Archivo</button>
              <input
                type='file'
                accept='.glt'
                className='hidden'
                id='fileInput'
                onChange={handleOpenFile}
              />
              <label htmlFor='fileInput' className='block px-4 py-2 text-white hover:bg-gray-700 w-full text-left cursor-pointer'>Abrir Archivo</label>
              <button className='block px-4 py-2 text-white hover:bg-gray-700 w-full text-left' onClick={handleSaveFile}>Guardar Archivo</button>
            </div>
          )}
        </div>
        <button className='bg-gray-700 hover:bg-gray-600 text-white font-bold py-2 px-4 rounded'>Reporte AST</button>
        <button className='bg-gray-700 hover:bg-gray-600 text-white font-bold py-2 px-4 rounded'>Tabla de Símbolos</button>
        <button className='bg-gray-700 hover:bg-gray-600 text-white font-bold py-2 px-4 rounded'>Reporte Errores</button>
      </div>
      <Editor
        height='70vh'
        defaultLanguage='javascript'
        theme='vs-dark'
        value={code}
        onChange={(value) => setCode(value || '')}
      />
      <button className='bg-b lue-600 hover:bg-blue-500 text-white font-bold py-2 px-4 rounded mt-4' onClick={handleExecute}>
        Ejecutar
      </button>
      <div className='mt-4 w-full max-w-3xl bg-gray-800 text-white p-4 rounded-md overflow-auto' style={{ height: '200px' }}>
        <h2 className='text-lg font-bold'>Consola</h2>
        <pre className='whitespace-pre-wrap'>{output || 'Esperando ejecución...'}</pre>
      </div>
    </div>
  );
}